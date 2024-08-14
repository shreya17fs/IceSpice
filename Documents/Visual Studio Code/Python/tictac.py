import random

def print_board(board):
    for row in board:
        print(" | ".join(row))
        print("-" * 9)

def check_winner(board, player):
    for i in range(3):
        if all([board[i][j] == player for j in range(3)]) or \
           all([board[j][i] == player for j in range(3)]):
            return True
    if all([board[i][i] == player for i in range(3)]) or \
       all([board[i][2-i] == player for i in range(3)]):
        return True
    return False

def is_board_full(board):
    return all([cell != " " for row in board for cell in row])

def get_empty_cells(board):
    empty_cells = []
    for i in range(3):
        for j in range(3):
            if board[i][j] == " ":
                empty_cells.append((i, j))
    return empty_cells

def minimax(board, depth, is_maximizing, alpha, beta):
    if check_winner(board, "X"):
        return -1
    if check_winner(board, "O"):
        return 1
    if is_board_full(board):
        return 0
    
    if is_maximizing:
        max_eval = -float('inf')
        for i, j in get_empty_cells(board):
            board[i][j] = "O"
            eval = minimax(board, depth + 1, False, alpha, beta)
            board[i][j] = " "
            max_eval = max(max_eval, eval)
            alpha = max(alpha, eval)
            if beta <= alpha:
                break
        return max_eval
    else:
        min_eval = float('inf')
        for i, j in get_empty_cells(board):
            board[i][j] = "X"
            eval = minimax(board, depth + 1, True, alpha, beta)
            board[i][j] = " "
            min_eval = min(min_eval, eval)
            beta = min(beta, eval)
            if beta <= alpha:
                break
        return min_eval

def get_best_move(board):
    best_eval = -float('inf')
    best_move = None
    for i, j in get_empty_cells(board):
        board[i][j] = "O"
        move_eval = minimax(board, 0, False, -float('inf'), float('inf'))
        board[i][j] = " "
        if move_eval > best_eval:
            best_eval = move_eval
            best_move = (i, j)
    return best_move

def main():
    board = [[" " for _ in range(3)] for _ in range(3)]
    human_player = "X"
    ai_player = "O"
    
    print("Welcome to Tic-Tac-Toe!")
    print_board(board)
    
    while True:
        row = int(input("Enter the row (0, 1, or 2): "))
        col = int(input("Enter the column (0, 1, or 2): "))
        
        if board[row][col] != " ":
            print("Invalid move. Cell already taken.")
            continue
        
        board[row][col] = human_player
        print_board(board)
        
        if check_winner(board, human_player):
            print("You win!")
            break
        elif is_board_full(board):
            print("It's a draw!")
            break
        
        print("AI's turn:")
        ai_row, ai_col = get_best_move(board)
        board[ai_row][ai_col] = ai_player
        print_board(board)
        
        if check_winner(board, ai_player):
            print("AI wins!")
            break
        elif is_board_full(board):
            print("It's a draw!")
            break

if __name__ == "__main__":
    main()
