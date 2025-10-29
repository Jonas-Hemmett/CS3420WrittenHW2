//
//  HomeView.swift
//  Concurrency
//
//  Created by Jason Hibbeler on 7/31/24.
//

import SwiftUI

struct HomeView: View {
  @State private var selection = 1

  var body: some View {
    TabView(selection: $selection) {
      FirstView()
        .tabItem() {
          Image(systemName: "1.square")
        }.tag(1)
      SecondView()
        .tabItem() {
          Image(systemName: "2.square")
        }.tag(2)
      ThirdView()
        .tabItem() {
          Image(systemName: "3.square")
        }.tag(3)
    }.frame(alignment: .bottomLeading)
  }
}

#Preview {
    HomeView().environmentObject(Service(name: "Maria"))
}
