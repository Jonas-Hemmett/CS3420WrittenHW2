//
//  CustomStepper.swift
//  SimpleTwoScreenApp_Observation
//
//  Created by Jason Hibbeler on 10/11/25.
//

import SwiftUI

import SwiftUI

struct CustomStepper: View {
  var text: String
  var upImageName: String
  var downImageName: String
  var color: Color
  var upAction: () -> Void = {}
  var downAction: () -> Void = {}
  
  var body: some View {
    HStack() {
      Text(text).padding(.trailing, 50).foregroundStyle(color)
      Button(action: upAction) {Image(systemName: upImageName).foregroundStyle(color)}
      Button(action: downAction) {Image(systemName: downImageName).foregroundStyle(color)}
    }
  }
}

#Preview {
  CustomStepper(text: "Test", upImageName: "arrow.up", downImageName: "arrow.down", color: .green)
}
