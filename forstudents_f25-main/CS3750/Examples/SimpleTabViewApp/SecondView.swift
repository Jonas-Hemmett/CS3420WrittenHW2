//
//  SwiftUIView.swift
//  SimpleTabViewApp
//
//  Created by Jason Hibbeler on 10/5/25.
//

import SwiftUI



struct SecondView: View {
  var body: some View {
    VStack {
      Image(systemName: "sun.horizon")
      Spacer().frame(width: 0, height: 50)
      Text("Second View")
    }
    .padding()
    .bottomLine()
  }
}

#Preview {
  SecondView()
}
