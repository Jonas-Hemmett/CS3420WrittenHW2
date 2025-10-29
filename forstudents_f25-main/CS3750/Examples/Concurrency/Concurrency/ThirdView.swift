//
//  ThirdView.swift
//  Concurrency
//
//  Created by Jason Hibbeler on 7/31/24.
//

import SwiftUI

struct ThirdView: View {
  @StateObject var service2 = SecondService()
  @State private var message = ""
  
  func fetch() {
    Task {
      await service2.increment()
    }
  }
  
  var body: some View {
    VStack(spacing: 50) {
      Button(action: fetch) {Text("Update").font(.title).frame(minWidth: 160, minHeight: 50).border(.black)}
      HStack(spacing: 50) {
        Text("value is \(service2.value)").font(.title)
      }.padding()
      Text(message).foregroundColor(.red).font(.largeTitle)
    }
    .padding()
    
  }
}

#Preview {
  ThirdView()
}
