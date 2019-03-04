package com.grails.test

class Name {

    String name
    static hasMany = [infos:Information]
    static constraints = {
        name blank: false, unique: true
    }
}
