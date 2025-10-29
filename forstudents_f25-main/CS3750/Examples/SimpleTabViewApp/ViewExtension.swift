//
//  ViewExtension.swift
//  SimpleTabViewApp
//
//  Created by Jason Hibbeler on 10/5/25.
//

import SwiftUI

extension View {
  func bottomLine() -> some View {
    GeometryReader { geometry in
      self
        .frame(width: geometry.size.width, height: geometry.size.height).border(.black)
    }      .ignoresSafeArea(.all, edges: .top)
  }
}
