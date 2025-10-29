//
//  ItemDetail.swift
//  OverviewDetailSimple
//
//  Created by Jason Hibbeler on 7/24/24.
//  updated 7/25

import SwiftUI

struct ItemDetail: View {
  @Environment(\.editMode) private var editMode
  @ObservedObject var item: Item
  @State private var valueString = ""
  @State var foregroundColor = Color.black
  @State var isEditing = false {didSet(oldValue) { foregroundColor = isEditing ? Color.red:Color.black}}
  
  var body: some View {
    VStack(alignment: .leading) {
      HStack(spacing: 50) {
        Text("name:")
        TextField("", text: $item.name).textFieldStyle(.roundedBorder)
            .foregroundColor(foregroundColor)
            .disabled(!isEditing)
      }.padding()
      HStack(spacing: 50) {
        Text("value:")
        if editMode != nil && editMode!.wrappedValue.isEditing {
          TextField("", text: $valueString).textFieldStyle(.roundedBorder)
            .foregroundColor(.red)
        } else {
          Text("\(item.value)")
        }
      }.padding()
    }
    .environment(\.font, .largeTitle)
    .navigationTitle(item.name)
    .navigationBarTitleDisplayMode(.inline)
    .toolbar {
      ToolbarItem(placement: .navigationBarTrailing) { EditButton() } }
    .onAppear() { valueString = "\(item.value)" }
    .onChange(of: valueString) { if let v = UInt(valueString) {item.value = v} else {item.value = 0} }
    .onChange(of: self.editMode!.wrappedValue) {
      isEditing = self.editMode!.wrappedValue.isEditing
   }

  }
}

#Preview {
  ItemDetail(item: Item(name: "mouse", value: 5))
}
