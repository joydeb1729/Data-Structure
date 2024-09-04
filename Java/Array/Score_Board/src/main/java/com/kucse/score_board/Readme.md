# Java Scoreboard System - Problem and Solution

## Problem

The goal is to develop a scoreboard system in Java that:

1. Adds player names and scores while keeping the top scores in order.
2. Removes entries from the scoreboard.
3. Displays the top 3 scorers.

## Solution Approach

1. **GameEntry Class**:
   - **Purpose**: Represents a player's entry with a name and score.
   - **Solution**: Implemented methods to get player details and a `toString()` method to format the entry output.

2. **ScoreBoard Class**:
   - **Purpose**: Manages a list of `GameEntry` objects, maintaining the top scores in order.
   - **Solution**: 
     - `add()` method was corrected to insert new entries in the correct position and maintain the order of scores.
     - `remove()` method was revised to accurately remove entries and shift remaining entries.

3. **Main Class**:
   - **Purpose**: Provides user interaction for entering player names and scores, and displaying the top scorers.
   - **Solution**: Updated logic to handle user input, add entries, and display the top 3 scorers effectively.
