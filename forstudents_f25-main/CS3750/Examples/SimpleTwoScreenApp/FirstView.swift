//
//  FirstView.swift
//  SimpleTwoScreenApp
//
//  Created by Jason Hibbeler on 7/22/25.
//

import SwiftUI

struct FirstView: View {
  var body: some View {
    ZStack() {
      Rectangle().foregroundColor(.teal)
      Text("First View").font(.largeTitle).foregroundStyle( .white)
    }
  }
}

#Preview {
  FirstView()
}
