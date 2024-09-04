from scoreBoard.ScoreBoard import ScoreBoard
from scoreBoard.GameEntry import GameEntry


def display_top_scorers(score_board):
    count=0
    for i in range(score_board.get_total_entry()):
        entry = score_board.get_entry(i)

        if count<3:
            print (f"{i+1}. {entry}")
            count+=1



def main():

    score_board = ScoreBoard(5)

    print("Enter player names and score. Type 'exit' to quit.")

    while True:

        name = input("Enter Player Name: ")
        if name.lower() =='exit':
            break

        score = int(input(f"Enter {name}'s score: "))

        entry = GameEntry(name, score)
        score_board.add(entry)

        print("\nTop 3 Scorers: \n")
        display_top_scorers(score_board=score_board)

if __name__ == "__main__" :
    main()