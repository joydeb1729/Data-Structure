class GameEntry:

    def __init__(self, name, score):
        self.name = name
        self.score = score

    def get_name(self):
        return self.name
    
    def get_score(self):
        return self.score
    
    def __str__(self):
        return f"{self.get_name()} -  {self.get_score()}"
    