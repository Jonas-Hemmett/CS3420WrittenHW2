//
//  ContentView.swift
//  OverviewDetailSimple
//
//  Created by Jason Hibbeler on 7/24/24.
//

import SwiftUI

struct OverviewView: View {
  @EnvironmentObject var itemStore: ItemStore
  @Environment(\.scenePhase) var scenePhase
  
  var body: some View {
    NavigationStack {
      List(itemStore.allItems) { item in
        NavigationLink(
          destination: ItemDetail(item: item)) {
            ItemRow(item: item)
          }
      }
    }
    .onChange(of: scenePhase) {
      if scenePhase == .active {
        print("OverviewView active")
      } else if scenePhase == .inactive {
        itemStore.saveChanges()
        print("OverviewView inactive")
      } else if scenePhase == .background {
        print("OverviewView background")
      }
    } // onChange() closure
  }
}

#Preview {
  OverviewView().environmentObject(ItemStore())
}
