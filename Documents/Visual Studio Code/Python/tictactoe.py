import math

board = [' ' for _ in range(9)]

winning_combinations = [(0, 1, 2), (3, 4, 5), (6, 7, 8),
                        (0, 3, 6), (1, 4, 7), (2, 5, 8),
                        (0, 4, 8), (2, 4, 6)]

def print_board(board):
    for i in range(0, 9, 3):
        print(board[i] + '|' + board[i+1] + '|' + board[i+2])
        if i < 6:
            print('-'*5)

def is_winner(board, player):
    for combo in winning_combinations:
        if all(board[i] == player for i in combo):
            return True
    return False

def is_draw(board):
    return ' ' not in board

def get_empty_cells(board):
    return [i for i, cell in enumerate(board) if cell == ' ']

def minimax(board, depth, is_maximizing):
    if is_winner(board, 'O'):
        return 1
    if is_winner(board, 'X'):
        return -1
    if is_draw(board):
        return 0
    
    if is_maximizing:
        max_eval = -math.inf
        for move in get_empty_cells(board):
            board[move] = 'O'
            eval = minimax(board, depth + 1, False)
            board[move] = ' '
            max_eval = max(max_eval, eval)
        return max_eval
    else:
        min_eval = math.inf
        for move in get_empty_cells(board):
            board[move] = 'X'
            eval = minimax(board, depth + 1, True)
            board[move] = ' '
            min_eval = min(min_eval, eval)
        return min_eval

def get_best_move(board):
    best_eval = -math.inf
    best_move = None
    for move in get_empty_cells(board):
        board[move] = 'O'
        eval = minimax(board, 0, False)
        board[move] = ' '
        if eval > best_eval:
            best_eval = eval
            best_move = move
    return best_move

def main():
    print("Welcome to Tic-Tac-Toe!")
    print_board(board)
    
    while True:
        human_move = int(input("Enter your move (0-8): "))
        if board[human_move] == ' ':
            board[human_move] = 'X'
            print_board(board)
            
            if is_winner(board, 'X'):
                print("You win!")
                break
            elif is_draw(board):
                print("It's a draw!")
                break
            
            print("AI's turn:")
            ai_move = get_best_move(board)
            board[ai_move] = 'O'
            print_board(board)
            
            if is_winner(board, 'O'):
                print("AI wins!")
                break
            elif is_draw(board):
                print("It's a draw!")
                break
        else:
            print("Cell already taken. Try again.")

if __name__ == "__main__":
    main()
