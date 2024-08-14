class RuleBasedChatbot:
    def __init__(self):
        self.rules = {
            "hello": "Hi I am chatbot",
            "hi": "Hello! How can I help you?",
            "how are you": "I'm good, how are you? I'm here to assist you!",
            "bye": "Goodbye! Have a great day!",
            "thank you": "Your welcome!",
            "how can you help": "I can assist you regarding your problems",
            "weather report" : "It's a nice weather to hang out with friends",
            "good": "Nice to hear that",
        }

    def get_response(self, user_input):
        user_input = user_input.lower()
        response = "I'm sorry, I don't understand."

        for rule, reply in self.rules.items():
            if rule in user_input:
                response = reply
                break

        return response

def main():
    chatbot = RuleBasedChatbot()
    print("Rule-Based Chatbot: Hello! you can type 'bye' if you want to exit.")

    while True:
        user_input = input("You: ")
        if user_input.lower() == "bye":
            print("Rule-Based Chatbot: Goodbye! Have a great day!")
            break

        response = chatbot.get_response(user_input)
        print("Rule-Based Chatbot:", response)

if __name__ == "__main__":
    main()
