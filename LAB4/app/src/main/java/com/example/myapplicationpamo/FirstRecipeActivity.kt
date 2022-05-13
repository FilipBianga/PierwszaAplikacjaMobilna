package com.example.myapplicationpamo

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.widget.TextView

class FirstRecipeActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first_recipe)

        val textView = findViewById<TextView>(R.id.gradients)
        textView.movementMethod = ScrollingMovementMethod()
        textView.text = "Składniki:\n" +
                "1 mały kalafior\n" +
                "1 marchew\n" +
                "mała pietruszka\n" +
                "2 ziemniaki\n" +
                "sól\n" +
                "pieprz\n" +
                "1 czubata łyżka masła\n" +
                "ok. 700 ml bulionu drobiowego\n" +
                "1 ząbek czosnku\n" +
                "150 ml śmietany 18-22%\n" +
                "szczypta cukru\n" +
                "duża szczypta gałki muszkatołowej świeżo tartej\n" +
                "50 g mascarpone\n" +
                "Ponadto:\n" +
                "½ opakowania ciasta francuskiego\n" +
                "1 żółtko\n" +
                "½ szklanki startego parmezanu\n" +
                "świeży koperek, tymianek – do podania\n\n"+
                "Przygotowanie:\n" +
                "Kalafior dzielimy na małe różyczki, marchew i pietruszkę obieramy. Marchew zostawiamy w całości, a pietruszkę i ziemniaki kroimy w dużą kostkę. W garnku rozgrzewamy masło, wrzucamy na nie kalafior i pietruszkę. Podsmażamy chwilę, dorzucamy ziemniaki, marchew i zalewamy bulionem. Gotujemy do czasu, aż warzywa będą miękkie.\n" +
                "\n" +
                "W tym czasie przygotowujemy paluchy z ciasta francuskiego. Piekarnik nagrzewamy do 200 stopni. Rozkładamy ciasto francuskie na blacie lub stolnicy, kroimy w paski o szerokości 1 cm i długości ok. 15 cm, najlepiej za pomocą radełka. Bierzemy 3 paski, sklejamy je dość mocno na górze i zaplatamy warkoczyk. Smarujemy rozkłóconym jajem, posypujemy parmezanem i układamy na blaszce wyłożonej papierem do pieczenia. Wstawiamy do pieca na ok. 10 -15 minut do ładnego zrumienienia.\n" +
                "\n" +
                "Wyławiamy marchew z zupy, studzimy i kroimy w półplasterki. Do zupy dodajemy mascarpone, przeciskamy ząbek czosnku, doprawiamy solą i pieprzem i miksujemy na krem. Hartujemy śmietankę i dolewamy do zupy. Ciepły krem serwujemy posypany ziołami z paluchem z ciasta francuskiego.\n\n\n\n\n"
    }
}