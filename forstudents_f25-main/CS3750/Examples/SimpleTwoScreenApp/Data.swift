//
//  Data.swift
//  SimpleTwoScreenApp
//
//  Created by Jason Hibbeler on 7/22/25.
//

import SwiftUI

class Data: ObservableObject {
  @Published var count: Int
  
  init(count: Int) {
    self.count = count
  }
}
