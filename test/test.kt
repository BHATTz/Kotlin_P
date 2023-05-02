fun main(){
  var stringList: List<String> = listOf<String>("shikha","sehafali", "jhanvi","aman", "priya","shefali", "sneha")
  var list: List<String> = listOf<String>("anjali", "pooja","renu")
  for(element in stringList){
      print(element+" ")
  }
  println()
  println(stringList.get(0))
  println(stringList.indexOf("shefali"))
  println(stringList.lastIndexOf("Pooja"))
  println(stringList.size)
  println(stringList.contains("ram"))
  println(stringList.containsAll(list))
  println(stringList.subList(2,4))
  println(stringList.isEmpty())
  println(stringList.drop(1))
  println(stringList.dropLast(2))
}