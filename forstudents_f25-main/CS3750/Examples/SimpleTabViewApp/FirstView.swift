//
//  ContentView.swift
//  SimpleTabViewApp
//
//  Created by Jason Hibbeler on 10/5/25.
//

import SwiftUI

struct FirstView: View {
  var body: some View {
      VStack {
        Image(systemName: "star.fill")
        Spacer().frame(width: 0, height: 50)
        Text("First View")
      }
      .padding()
      .bottomLine()
  }
}

#Preview {
  FirstView()
}
