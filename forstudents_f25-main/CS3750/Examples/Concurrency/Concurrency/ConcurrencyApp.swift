//
//  ConcurrencyApp.swift
//  Concurrency
//
//  Created by Jason Hibbeler on 7/30/24.
//

import SwiftUI

@main
struct ConcurrencyApp: App {
    var body: some Scene {
        WindowGroup {
          HomeView().environmentObject(Service(name: "Maria"))
        }
    }
}
