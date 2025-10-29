//
//  ContentView.swift
//  SimpleTwoScreenApp_Observation
//
//  Created by Jason Hibbeler on 10/11/25.
//

import SwiftUI

struct HomeView: View {
  @Environment(DataModel.self) private var data: DataModel
  @State private var showSecondView = false
  
  func toggle() {
    showSecondView = !showSecondView
  }
  
  var body: some View {
    VStack {
      Spacer()
      if showSecondView {
        SecondView()
      } else {
        FirstView()
      }
      Spacer()
      HStack() {
        if showSecondView {
          Text("Back")
        } else {
          Text("Forward")
        }
        if showSecondView {
          Button(action: toggle) { Text("⬅️") }
        } else {
          Button(action: toggle) { Text("➡️") }
        }
      }
      Spacer()
    }
    
    .padding()
  }
}

#Preview {
  HomeView().environment(DataModel(count: 0))
}

