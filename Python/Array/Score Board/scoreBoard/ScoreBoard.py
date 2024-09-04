class ScoreBoard:

    def __init__(self, capacity):
        self.total_entry = 0
        self.board = [None] * capacity


    def add(self, entry):
        new_score = entry.get_score()

        if(self.total_entry < len(self.board) or new_score > self.board[self.total_entry - 1].get_score()):
            if(self.total_entry < len(self.board)):
                self.total_entry+=1
            
            last_index = self.total_entry - 1

            while(last_index > 0 and new_score > self.board[last_index-1].get_score()):
                self.board[last_index] = self.board[last_index-1]
                last_index-=1
            self.board[last_index] = entry

    

    def remove(self, index):
        if(index < 0 or index >= self.total_entry):
            raise IndexError(f"Invalid index: {index}")
        
        removed_entry = self.board[index]

        for i in range(index, self.total_entry-1):
            self.board[i] = self.board[i+1]
        
        self.board[self.total_entry-1] = None
        self.total_entry-=1

    def get_entry(self, index):
        return self.board[index]
    
    def get_total_entry(self):
        return self.total_entry