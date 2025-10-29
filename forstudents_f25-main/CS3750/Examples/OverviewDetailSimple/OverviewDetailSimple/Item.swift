//
//  Item.swift
//  OverviewDetailSimple
//
//  Created by Jason Hibbeler on 7/24/24.
//

import Foundation

class Item: Identifiable, ObservableObject, Codable {
  @Published var name: String
  @Published var value: UInt

  enum CodingKeys: CodingKey {
    case name
    case value
  }

  required init(from decoder: Decoder) throws {
    let container = try decoder.container(keyedBy: CodingKeys.self)
    name = try container.decode(String.self, forKey: .name)
    value = try container.decode(UInt.self, forKey: .value)
  }

  func encode(to encoder: Encoder) throws {
    var container = encoder.container(keyedBy: CodingKeys.self)
    try container.encode(name, forKey: .name)
    try container.encode(value, forKey: .value)
  }
  
  init(name: String, value: UInt) {
    self.name = name
    self.value = value
  }
}
