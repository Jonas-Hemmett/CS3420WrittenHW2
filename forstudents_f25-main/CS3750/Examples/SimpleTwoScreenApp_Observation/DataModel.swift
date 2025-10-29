//
//  Data.swift
//  SimpleTwoScreenApp_Observation
//
//  Created by Jason Hibbeler on 10/11/25.
//

import SwiftUI

@Observable class DataModel {
  var count: Int
  
  init(count: Int) {
    self.count = count
  }
}
