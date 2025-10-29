//
//  ContentView.swift
//  Concurrency
//
//  Created by Jason Hibbeler on 7/30/24.
//

import SwiftUI

struct FirstView: View {
  @State private var messageOne = ""
  @State private var messageTwo = ""
  let limit = 4000
  
  func syncFunction() {
    messageOne = "Sync Start"
    var count = 0
    for i in 0...limit {
      for j in 0...limit {
        if i == j {
          count = count + 1
        }
      }
    }
    messageOne = "Sync Done"
  }
  
  func asyncFunction() {
    Task {
      do {
        messageTwo = "Async Start"
        var count = 0
        for i in 0...2*limit {
          for j in 0...2*limit {
            if i == j {
              count = count + 1
            }
          }
        }
        messageTwo = "Async Done"
      }
    }
  }
  
  var body: some View {
    VStack(spacing: 50) {
      Button(action: syncFunction) {Text("Go - sync").font(.title).frame(minWidth: 160, minHeight: 50).border(.black)}
      Button(action: asyncFunction) {Text("Go - async").font(.title).frame(minWidth: 160, minHeight: 50).border(.black)}
      Text(messageOne).foregroundColor(.red).font(.largeTitle)
      Text(messageTwo).foregroundColor(.red).font(.largeTitle)
    }
    .padding()
  }
}

#Preview {
  FirstView()
}
