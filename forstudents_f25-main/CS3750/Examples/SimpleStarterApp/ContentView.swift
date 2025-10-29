//
//  ContentView.swift
//  SimpleStarterApp
//
//  Created by Jason Hibbeler on 7/21/25.
//

import SwiftUI

struct ContentView: View {
  @State private var value = true
  var body: some View {
    VStack {
      Spacer()
      Button(action: {value = !value}) {Text("Button")}
      Spacer()
      Text("\(value)")
      Spacer()
    }
    .padding()
  }
}

#Preview {
  ContentView()
}
