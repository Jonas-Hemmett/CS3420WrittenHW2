//
//  ItemRow.swift
//  OverviewDetailSimple
//
//  Created by Jason Hibbeler on 7/24/24.
//

import SwiftUI

struct ItemRow: View {
  @ObservedObject var item: Item
  
  var body: some View {
    VStack(alignment: .leading) {
      HStack {
        Text(item.name)
        Spacer()
        Text("\(item.value)")
      }
    }.padding()
  }
}

#Preview {
  ItemRow(item: Item(name: "mouse", value: 10))
}
