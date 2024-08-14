import pandas as pd
import random
from sklearn.feature_extraction.text import TfidfVectorizer
from sklearn.metrics.pairwise import cosine_similarity

data = {
    'Title': ['Bloody Daddy', '3 Idiots', 'Hera Pheri', 'Welcome', 'Thank God'],
    'Genre': ['Drama', 'Action', 'Comedy', 'Action, Drama', 'Comedy, Drama']
}

movies_df = pd.DataFrame(data)

tfidf_vectorizer = TfidfVectorizer(stop_words='english')

tfidf_matrix = tfidf_vectorizer.fit_transform(movies_df['Genre'])

movie_similarity = cosine_similarity(tfidf_matrix)

def recommend_movies(genre, movie_title, num_recommendations=3):
    idx = movies_df[movies_df['Title'] == movie_title].index[0]
    movie_scores = movie_similarity[idx]
    similar_movies = movie_scores.argsort()[-num_recommendations-1:-1][::-1]
    return movies_df['Title'].iloc[similar_movies]

while True:
    user_genre = input("Enter your preferred genre (or 'exit' to quit): ")
    if user_genre.lower() == 'exit':
        print("Goodbye!")
        break
    
    user_movie = input("Enter a movie title you like: ")
    recommendations = recommend_movies(user_genre, user_movie)
    
    print(f"Recommendations based on genre '{user_genre}' and movie '{user_movie}':")
    for i, movie in enumerate(recommendations, start=1):
        print(f"{i}. {movie}")
    
    print("\n")
