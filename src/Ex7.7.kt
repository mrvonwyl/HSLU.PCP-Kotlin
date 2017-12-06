package excercises

fun main(args: Array<String>){
    var dir: MutableList<Entry> = mutableListOf()

    while(true){
        val input: List<String> = readLine().toString().split(" ")

        if(input[0].equals("add", true) && input.size >= 3){
            val e1 = Entry(input[1], input[2]?.toInt())
            val e2 = dir.find{ it.name == input[1] }

            if(e1.name == e2?.name){
                println("entry with name '" + e1.name + "' already exists")
            }
            else {
                dir.add(e1)
                println("added $e1")
            }
        }
        else if(input[0].equals("check", true) && input.size >= 2){
            println(dir.find{ it.name == input[1] })
        }
    }
}

data class Entry(val name: String, val phone: Int)