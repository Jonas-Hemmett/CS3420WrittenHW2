//
//  OverviewDetailSimpleApp.swift
//  OverviewDetailSimple
//
//  Created by Jason Hibbeler on 7/24/24.
//

import SwiftUI

@main
struct OverviewDetailSimpleApp: App {
    var body: some Scene {
        WindowGroup {
          OverviewView().environmentObject(ItemStore())
        }
    }
}
