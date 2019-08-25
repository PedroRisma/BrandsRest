package brandsrest

import grails.rest.Resource

@Resource(uri='/brands')
class Brands {
    String name
    static hasMany = [articles: Article]

    static constraints = {
        name blank: false, nullable: false
    }

}
