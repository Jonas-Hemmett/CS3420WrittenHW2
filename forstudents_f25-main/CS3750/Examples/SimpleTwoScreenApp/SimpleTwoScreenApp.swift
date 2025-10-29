//
//  SimpleTwoScreenAppApp.swift
//  SimpleTwoScreenApp
//
//  Created by Jason Hibbeler on 7/21/25.
//

import SwiftUI

@main
struct SimpleTwoScreenApp: App {
    var body: some Scene {
        WindowGroup {
          HomeView().environmentObject(Data(count: 0))
        }
    }
}
