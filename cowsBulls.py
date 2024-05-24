import random
import tkinter

four_letter_words = ['book', 'ship', 'gold', 'tree', 'love', 'dark', 'moon', 'fire', 'wine', 'rock',
                     'army', 'sand', 'rain', 'wind', 'road', 'foot', 'bear', 'duck', 'girl', 'kiss',
                     'play', 'blue', 'time', 'hand', 'bell', 'jump', 'hope', 'wall', 'star', 'haze',
                     'fish', 'lamp', 'tape', 'fear', 'rise', 'draw', 'leaf', 'lake', 'pool', 'wood',
                     'bone', 'rose', 'town', 'face', 'milk', 'home', 'fade', 'bird', 'nest', 'seed',
                     'king', 'hill', 'mind', 'nail', 'door', 'frog', 'zero', 'dawn', 'lead', 'bark',
                     'game', 'fall', 'call', 'care', 'fade', 'gear', 'gaze', 'high', 'idea', 'join',
                     'keep', 'kill', 'lace', 'mile', 'near', 'open', 'pale', 'quit', 'race', 'sell',
                     'true', 'user', 'vast', 'wait', 'yoga', 'zone', 'work', 'zeal', 'your', 'zeus',
                     'cola', 'tape', 'quiz', 'palm', 'jest', 'tall', 'luck', 'rack', 'mule', 'army',
                     'term', 'hero', 'yell', 'frog', 'dust', 'fact', 'land', 'pink', 'rope', 'shot',
                     'bend', 'star', 'rich', 'edge', 'roar', 'meal', 'list', 'card', 'dock', 'film',
                     'loud', 'fire', 'deep', 'gift', 'jump', 'coal', 'joke', 'last', 'dawn', 'note',
                     'wear', 'kill', 'deck', 'vase', 'tile', 'chip', 'fern', 'bomb', 'wait', 'spin',
                     'moon', 'wise', 'nest', 'chip', 'fade', 'bark', 'seal', 'pipe', 'lawn', 'glow',
                     'goal', 'heal', 'path', 'lure', 'pipe', 'bath', 'soil', 'term', 'zero', 'salt',
                     'zest', 'quiz', 'pond', 'gift', 'shot', 'tone', 'logo', 'soil', 'road', 'moon',
                     'park', 'glow', 'tide', 'soap', 'ruby', 'silk', 'sour', 'toys', 'grip', 'tree',
                     'lazy', 'exit', 'wind', 'bind', 'roof', 'bust', 'toss', 'foul', 'lift', 'swim',
                     'loop', 'crop', 'arch', 'cure', 'ally', 'fade', 'jail', 'rude', 'gear', 'vein',
                     'easy', 'twin', 'root', 'pace', 'hail', 'torn', 'joys', 'dive', 'rung', 'jury']


def generate_secret_word():
    """Generates a random four-letter word from the provided dictionary."""

    secret_word = random.choice(four_letter_words)
    # print(secret_word)
    return secret_word

def check_guess(secret_word, guess):
    """Checks the user's guess and returns the number of cows and bulls."""

    cows, bulls = 0, 0
    for i in range(len(secret_word)):
        if secret_word[i] == guess[i]:
            bulls += 1
        elif guess[i] in secret_word:
            cows += 1

    return cows, bulls

def play_cows_and_bulls():
    """Main game loop."""

    secret_word = generate_secret_word()
    guesses = 0

    print("Welcome to Cows and Bulls!")
    print("Guess a four-letter word. You'll get hints based on cows and bulls.")

    while True:
        guess = input("Enter your guess: ").lower()
        if len(guess) != 4 or not guess.isalpha():
            print("Invalid guess. Please enter a four-letter word.")
            continue

        cows, bulls = check_guess(secret_word, guess)
        guesses += 1

        print(f"Cows: {cows}, Bulls: {bulls}")

        if bulls == 4:
            print(f"Congratulations! You guessed the word in {guesses} guesses.")
            break

if __name__ == "__main__":
    play_cows_and_bulls()