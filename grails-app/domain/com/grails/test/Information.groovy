package com.grails.test

class Information {

    String summary
    String details
    Date createdDate
    static hasMany = [names:Name]
    static belongsTo = Name
    static constraints = {
        summary blank: true, unique: false
        details blank: true, unique: false
        createdDate nullable: false
    }
}
