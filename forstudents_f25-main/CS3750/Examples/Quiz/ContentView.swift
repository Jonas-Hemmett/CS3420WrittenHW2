//
//  ContentView.swift
//  Quiz
//
//  Created by Jason Hibbeler on 7/10/25.
//

import SwiftUI

struct ContentView: View {
  let questions = ["What is the capital of Wisconsin?", "Who directed the film 'Tenet?'", "What is the tallest mountain in Africa?"]
  let answers = ["Madison", "Christopher Nolan", "Mt. Kilimanjaro"]
  @State var currentQuestionIndex = 0
  @State var showAnswer = false
  
  var body: some View {
    VStack {
      Text(questions[currentQuestionIndex])
      Spacer()
      Button("Show Answer", action: {showAnswer = true})
      Spacer()
      if showAnswer {
        Text(answers[currentQuestionIndex])
      }
      Spacer()
      Button("Next Question", action: {currentQuestionIndex = (currentQuestionIndex + 1) % questions.count; showAnswer = false})
    }.frame(height: 200)
    .padding()
  }
}

#Preview {
  ContentView()
}
