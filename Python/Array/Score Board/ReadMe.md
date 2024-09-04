# Python Scoreboard System - Problem and Solution

## Problem

The task is to create a scoreboard system in Python that:

1. Allows adding player names and scores.
2. Maintains and updates the top scores in order.
3. Displays the top 3 scorers.

## Solution Approach

1. **GameEntry Class**:
   - **Purpose**: Represents an entry with a player's name and score.
   - **Solution**: Implemented methods to get player details and a `__str__()` method for formatted output.

2. **ScoreBoard Class**:
   - **Purpose**: Manages a list of `GameEntry` objects, ensuring top scores are maintained in order.
   - **Solution**: 
     - `add()` method was implemented to insert new entries into the correct position and maintain the order.
     - `remove()` method was implemented to remove entries and shift remaining entries.

3. **Main Function**:
   - **Purpose**: Handles user input for adding scores and displays the top 3 scorers.
   - **Solution**: Integrated input handling, added entries, and implemented logic to display the top 3 scorers.

