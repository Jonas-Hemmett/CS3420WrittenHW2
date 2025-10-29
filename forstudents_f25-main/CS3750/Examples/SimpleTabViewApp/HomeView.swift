//
//  ContentView.swift
//  SimpleTabViewApp
//
//  Created by Jason Hibbeler on 10/5/25.
//

import SwiftUI

struct HomeView: View {
  var body: some View {
    TabView {
      FirstView()
        .tabItem() {
          Image(systemName: "star")
        }
      SecondView()
        .tabItem() {
          Image(systemName: "sun.horizon")
        }
    }
  }
}

#Preview {
  HomeView()
}
