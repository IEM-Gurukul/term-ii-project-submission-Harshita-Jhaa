[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/pG3gvzt-)
# PCCCS495 – Term II Project

## Project Title
CodeLingo: A High-Maturity Gamified Study Engine


## Problem Statement (max 150 words)
Modern productivity tools often fail to sustain long-term engagement because they lack meaningful feedback loops and specialized tracking for different task types. CodeLingo solves this by treating study sessions as "Quests" with varying difficulty and rewards. It addresses the "consistency gap" by implementing a Duolingo-inspired momentum engine that calculates streaks and XP (Experience Points) based on task complexity.


## Target User
Computer Science students seeking to gamify their coding consistency and track habit momentum.


## Core Features
- **Dynamic Quest Creation**: Categorize study sessions into "Coding" or "Theory" types via a Factory pattern.
- **Momentum Engine**: A streak-tracking algorithm that calculates daily consistency and applies XP multipliers.
- **XP & Leveling System**: Progress-based leveling where different task types yield polymorphic rewards.
- **Persistence Layer**: Automatic saving and loading of user profiles and quest history to local .txt files.
- **Robust Input Validation**: Comprehensive error handling for invalid task parameters and custom exceptions.


## OOP Concepts Used

- **Abstraction**: Use of an abstract class **Quest** to define a rigorous contract for all study activities.
- **Inheritance**: Specialized subclasses (CodingQuest, TheoryQuest) inheriting from the base Quest class.
- **Polymorphism**: Method overriding in subclasses to calculate unique XP rewards dynamically at runtime.
- **Exception Handling**: Custom exception hierarchy (**InvalidQuestException**) for graceful failure management.


## Proposed Architecture Description
CodeLingo follows a Layered Architecture to ensure a strict separation of concerns.

- **Model Layer**: Defines the data entities like Quest.
- **Service Layer**: Contains the Momentum Engine and XP calculation logic.
- **Data Access Layer**: Handles File I/O for local persistence in user_stats.txt.
- **Factory Design Pattern**: Intentionally used to manage object creation, demonstrating high design maturity.


## How to Run
1. **Navigate**: Open your terminal and go to the src/ directory.
2. **Compile**: Run javac *.java to compile all classes.
3. **Execute**: Run java CodeLingoApp to start the engine.
4. **Save Progress**: Ensure you select the Exit option from the menu to save your stats to the local file.
---

## Git Discipline Notes
Minimum 10 meaningful commits required.
