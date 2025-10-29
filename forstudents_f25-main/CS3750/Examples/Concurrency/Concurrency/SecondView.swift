//
//  ContentView.swift
//  Concurrency
//
//  Created by Jason Hibbeler on 7/30/24.
//

import SwiftUI

struct SecondView: View {
  @EnvironmentObject var service: Service
  @State private var message = ""
  
  func increment() {
    Task {
      do {
        await service.incrementCount()
//      await service.incrementCountSlow()
      }
    }
  }
  
  var body: some View {
    VStack(spacing: 50) {
      Button(action: increment) {Text("Service").font(.title).frame(minWidth: 160, minHeight: 50).border(.black)}
      HStack(spacing: 50) {
        Text(service.name).font(.title)
      Text("(\(service.count))").font(.title)
      }.padding()
      Text(message).foregroundColor(.red).font(.largeTitle)
    }
    .padding()
  }
}

#Preview {
  SecondView().environmentObject(Service(name: "Maria"))
}
