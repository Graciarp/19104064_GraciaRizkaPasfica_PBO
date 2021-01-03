function mixin(receiver, supplier){
  for(var property in supplier){
    if(receiver.hasOwnProperty(property)){
      receiver[property] = supplier[property]
    }
  }
  return receiver
}

var person = (function(){
  var name = 'Chara'
  var age = 25

  function setName(newName){
    name = newName
  }

  function getName(){
    return age
  }

  function getAge(){
    return age
  }

  return {setName : setName, getName : getName, getAge : getAge}
}())


var Title = (function(){
  var element = 'Anemo'

  function InnerTitle(title){
    this.title = title
    this.element = element
  }
  return InnerTtitle
}())

person.setName('Jean')
var Title = new Title('Grand Master')

mixin(person, title)

console.log(`Name\t: ${person.getName}`)
console.log(`Age\t: ${person.getAge()}`)
console.log(`Title\t: ${person.title}`)
console.log(`Element\t: ${person.element}`)