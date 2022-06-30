class English():
    def speakEnglish(self):
        print("i speak english, hello world")

class Chines():
    def speakChines(self):
        print("Wǒ shuō zhōngwén, Nǐ hǎo shìjiè")

class Poligrota(English, Chines):
    def speakEnglishAndChines(self):
        print("Hi this is Hello world in English, And this is Nǐ hǎo shìjiè(Hello world) in chinese")
    
person = Poligrota()
person.speakEnglish()
person.speakChines()
person.speakEnglishAndChines()