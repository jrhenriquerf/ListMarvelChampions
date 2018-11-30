package aula.fib.br.customizedlist

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class CustomizedList : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customized_list)

        val listaContatos = ArrayList<Campeao>()
        listaContatos.add(Campeao(1L, "Capitão América", "Capitão América é um super-herói de histórias em quadrinhos americanos publicado pela Marvel Comics. Criado por Joe Simon e Jack Kirby. Capitão América foi concebido como um super-herói patriótico que lutou contra as potências do Eixo na Segunda Guerra Mundial[1] e foi personagem mais popular da Timely Comics durante o período da guerra."))
        listaContatos.add(Campeao(2L, "Capitã Marvel", "A vida da piloto da Força érea, Carol Danvers, mudou para sempre quando ela foi atingida por uma explosão de uma nave alienígena Kree. Ela ganhou poderes sobre-humanos de força, voo e a habilidade de disparar raios de energia. Integrante dos Vingadores e dos Guardiões da Galáxia, Carol inspira muitas pessoas através de seu lema: 'Seremos as estrelas que nosso destino determina'"))
        listaContatos.add(Campeao(3L, "Drax, O Destruídor", "Arthur Douglas era um ser humano cuja família foi atacada e morta pelo vilão Thanos. Precisando de um campeão para combater Thanos, o ser conhecido como Kronos tomou o espírito de Arthur e o colocou em um novo e poderoso corpo e então Drax, o Invisível nasceu. Os poderes de Drax incluíam maior resistência, vôo, e a capacidade de projetar rajadas de energia de suas mãos."))
        listaContatos.add(Campeao(4L, "Gamora", "'A mulher mais perigosa do mundo' é um título difícil de conquistar, e mais difícil ainda de mantê-lo. Mas Gamora enfrentou, universo afora, batalhas e brigas suficientes para que o título seja dela por um bom tempo. Ela é mais forte e mais rápida do que você e mais durona do que qualquer um. Ela é a filha adotiva de Thanos, mas é extremamente leal a seus colegas Guardiões da Galáxia."))
        listaContatos.add(Campeao(5L, "Groot", "Groot era um Colossus Floral do Planeta X, a capital dos mundos das plantas. O rebento que viria a ser conhecido como \"Groot\" veio de um \"Enobled Sap-Line\" e dotado de engenharia superposicional quasi-dimensional...pelo menos, de acordo com Maximus, o Louco."))
        listaContatos.add(Campeao(6L, "Homem de ferro", "Homem de Ferro (Iron Man, em inglês) é um personagem fictício dos quadrinhos publicados pela Marvel Comics. Sua identidade verdadeira é a do empresário e bilionário Tony Stark, que usa armaduras de alta tecnologia no combate ao crime. Foi criado em 1963 pelo escritor Stan Lee, o roteirista Larry Lieber, e os desenhistas Jack Kirby e Don Heck. O objetivo de seu criador, Stan Lee, era aceitar o desafio de fazer um personagem ser odiado e depois amado pelo público, assim, criou um dos super heróis mais marcantes de todos os tempos."))
        listaContatos.add(Campeao(7L, "Homem de ferro Superior", "Homem de Ferro (Iron Man, em inglês) é um personagem fictício dos quadrinhos publicados pela Marvel Comics. Sua identidade verdadeira é a do empresário e bilionário Tony Stark, que usa armaduras de alta tecnologia no combate ao crime. Foi criado em 1963 pelo escritor Stan Lee, o roteirista Larry Lieber, e os desenhistas Jack Kirby e Don Heck. O objetivo de seu criador, Stan Lee, era aceitar o desafio de fazer um personagem ser odiado e depois amado pelo público, assim, criou um dos super heróis mais marcantes de todos os tempos."))
        listaContatos.add(Campeao(8L, "Homem aranha", "Lee e Ditko conceberam o personagem como um órfão, que foi educado e criado pela sua Tia May e o seu Tio Ben em Nova Iorque, e, enquanto adolescente, tem de lidar com as lutas diárias normais da sua idade, em adição àquelas que tem como combatente do crime mascarado. Para combater os seus inimigos, os criadores deram-lhe super força e agilidade, a habilidade de conseguir aderir na maior parte das superfícies, a possibilidade de disparar teias de aranha através de mecanismos montados nos pulsos (inventados por ele próprio, a que ele chama \"lança-teia\" - \"web-shooters\") e consegue reagir precognitivamente ao perigo com o seu \"sentido-aranha\" (\"spider-sense\"). Os seus poderes foram adquiridos após ter sido mordido por uma aranha radioativa."))
        listaContatos.add(Campeao(9L, "Homem aranha (traje preto)", "Lee e Ditko conceberam o personagem como um órfão, que foi educado e criado pela sua Tia May e o seu Tio Ben em Nova Iorque, e, enquanto adolescente, tem de lidar com as lutas diárias normais da sua idade, em adição àquelas que tem como combatente do crime mascarado. Para combater os seus inimigos, os criadores deram-lhe super força e agilidade, a habilidade de conseguir aderir na maior parte das superfícies, a possibilidade de disparar teias de aranha através de mecanismos montados nos pulsos (inventados por ele próprio, a que ele chama \"lança-teia\" - \"web-shooters\") e consegue reagir precognitivamente ao perigo com o seu \"sentido-aranha\" (\"spider-sense\"). Os seus poderes foram adquiridos após ter sido mordido por uma aranha radioativa."))
        listaContatos.add(Campeao(10L, "Miss Marvel", "A personagem foi originalmente concebida como uma contraparte feminina do Capitão Marvel. Como o Capitão Marvel, a maioria dos portadores do título de Miss Marvel ganhar seus poderes através da tecnologia Kree ou genética. A Marvel publicou quatro séries intituladas Ms. Marvel, com os dois primeiros estrelados por Carol Danvers, e a terceira e quarta estrelado por Kamala Khan."))
        listaContatos.add(Campeao(11L, "Raio Negro", "Raio Negro (Black Bolt no original) é um personagem fictício que aparece nas histórias em quadrinhos publicadas pela Marvel Comics. Criado por Stan Lee e Jack Kirby em 1965, seus poderes são o de emitir gritos devastadores, erguer grande quantidade de peso e voar."))
        listaContatos.add(Campeao(12L, "Ronan", "Ele é membro da raça alienígena Kree, ele faz parte do principal universo compartilhado da Marvel, conhecido como Terra 616. Ronan apareceu pela primeira vez em \"Fantastic Four\" (vol. 1) #65 (1967), e foi criado por Stan Lee e Jack Kirby. O personagem passou a maior parte de sua existência como uma figura de vilão mas ao longo do tempo Ronan lentamente se tornou um dos mais nobres heróis."))
        listaContatos.add(Campeao(13L, "Thor", "Thor (nórdico antigo: Þórr) é o deus nórdico, dos trovões e das batalhas. Pertence ao clã dos deuses Æsir, e é filho do deus Odin. Thor usa como arma o martelo Mjolnir, e tem o cinto Megingjord, que lhe dobra a força. Está associado aos trovões, relâmpagos, tempestades, árvores de carvalho, força, proteção da humanidade e também a santificação, cura e fertilidade."))
        listaContatos.add(Campeao(14L, "Venom", "Venom é um personagem ficcional das histórias em quadrinhos na série do Homem-Aranha do Universo Marvel, publicadas pela Marvel Comics. Apesar de já ter tido mini-séries próprias, a maioria de suas aparições é como inimigo do personagem Homem-Aranha. Cujo hóspede sendo Eddie Brock, é um Simbionte Alienígena que é formado a partir de um líquido, o material orgânico de espessura. A característica marcante de Venom, além do uniforme negro, é a desproporcional e assustadora mandíbula, desenhada no traço de Todd MacFarlane. Antes de fundir-se ao simbionte e tornar-se o Venom, Eddie Brock era um repórter do jornal O Clarim Diário."))

        val adapter = CampeaoAdapter(applicationContext, listaContatos, assets)

        val lista = findViewById<ListView>(R.id.lista)
        lista.setAdapter(adapter)

        lista.setOnItemClickListener {parent, view, position, id ->
            val campeao = listaContatos.get(position)
            val intent = Intent(this, DetalheCampeao::class.java)
            intent.putExtra("campeao", campeao)
            startActivity(intent)
        }
    }
}
