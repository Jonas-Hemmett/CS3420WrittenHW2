//
//  ContentView.swift
//  SimpleTwoScreenApp
//
//  Created by Jason Hibbeler on 7/21/25.
//

import SwiftUI

struct HomeView: View {
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
  HomeView().environmentObject(Data(count: 0))
}
