//
//  SecondView.swift
//  SimpleTwoScreenApp
//
//  Created by Jason Hibbeler on 7/22/25.
//

import SwiftUI

struct SecondView: View {
  @EnvironmentObject var data: Data
  
  var body: some View {
    ZStack() {
      Rectangle().foregroundColor(.indigo)
      VStack() {
        Spacer()
        Text("Second View").font(.largeTitle).foregroundStyle(.white)
        Spacer()
        CustomStepper(text: "count is \(data.count)", upImageName: "plus.circle", downImageName: "minus.circle", color: .white, upAction: {data.count += 1}, downAction: {data.count -= 1}).font(.title2)
        .padding(50)
        Spacer()
      }
    }
  }
}

#Preview {
  SecondView().environmentObject(Data(count: 0))
}
