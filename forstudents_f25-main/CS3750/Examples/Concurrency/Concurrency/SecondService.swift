//
//  SecondService.swift
//  Concurrency
//
//  Created by Jason Hibbeler on 7/31/24.
//

import Foundation

class SecondService: ObservableObject {
  @Published var value: Int
  
  init() {
    value = 0
  }
  
  func increment() async {
    DispatchQueue.main.async {
      self.value = self.value + 1
      print("I am SecondService.increment(); value is now \(self.value)")
    }
  }
}
