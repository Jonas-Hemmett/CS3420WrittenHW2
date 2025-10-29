//
//  ItemStore.swift
//  OverviewDetailSimple
//
//  Created by Jason Hibbeler on 7/24/24.
//  updated 7/25
//

import Foundation

func load<T: Decodable>(_ url: URL) -> T {
  let data: Data
  
  do {
    data = try Data(contentsOf: url)
  } catch {
    fatalError("Couldn't load \(url.path) from main bundle:\n\(error)")
  }
  
  do {
    let decoder = JSONDecoder()
    return try decoder.decode(T.self, from: data)
  } catch {
    print("parse \(url.path)")
    fatalError("Couldn't parse \(url.path) as \(T.self):\n\(error)")
  }
} // load()

class ItemStore: ObservableObject {
  @Published var allItems: [Item] = []
  static var documentsDirFilename = "items.json"
  static var bundleFilename = "items-init.json"
  
  let itemArchiveURL: URL = {
    let documentsDirectories = FileManager.default.urls(for: .documentDirectory, in: .userDomainMask)
    let documentDirectory = documentsDirectories.first!
    return documentDirectory.appendingPathComponent(documentsDirFilename)
  } ()
  
  // uncomment this the first time your run and comment out the other init()
  //  init() {
  //    let i1 = Item(name: "rock", value: 1)
  //    let i2 = Item(name: "watch", value: 50)
  //    let i3 = Item(name: "mug", value: 5)
  //    allItems.append(i1)
  //    allItems.append(i2)
  //    allItems.append(i3)
  //  }
  
  // uncomment this for subsequent runs and comment out the hardcoded init() above
  init() {
    let fileManager = FileManager.default
    if fileManager.fileExists(atPath: itemArchiveURL.path) {
      print("load from \(itemArchiveURL.path)")
      self.allItems = load(itemArchiveURL)
    } else {
      if let url = Bundle.main.url(forResource: ItemStore.bundleFilename, withExtension: nil) {
        print("load from \(url.path)")
        self.allItems = load(url)
      } else {
        fatalError("can't find file to load")
      }
    }
  }
  
  @discardableResult
  func saveChanges() -> Bool {
    do {
      let encoder = JSONEncoder()
      let data = try encoder.encode(allItems)
      try data.write(to: itemArchiveURL, options: [.atomic])
      print("saved \(allItems.count) items to \(itemArchiveURL.path)")
      return true
    } catch let encodingError{
      print("Error encoding allItems: \(encodingError)")
      return false
    }
  }
}
