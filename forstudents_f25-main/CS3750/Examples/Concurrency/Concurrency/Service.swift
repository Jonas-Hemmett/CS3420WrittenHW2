//
//  Service.swift
//  Concurrency
//
//  Created by Jason Hibbeler on 7/30/24.
//

import Foundation

class Service: ObservableObject {
  @Published var name: String
  @Published var count: Int
  
  init(name: String) {
    self.name = name
    self.count = 0
  }
  
  func incrementCount() async {
    DispatchQueue.main.async {
      self.count = self.count + 1
    }
  }
  
  func incrementCountSlow() async {
    var x = 0
    for i in 0...3000 {
      for j in 0...3000 {
        if i == j {
          x = x + 1
        }
      }
    }
    self.count = self.count + 1
  }
}
