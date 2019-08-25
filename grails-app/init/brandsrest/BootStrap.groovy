package brandsrest

import grails.converters.JSON

class BootStrap {

    def init = { servletContext ->
        def marca1 = new Brands(name: "Adidas").save(flush:true)
        def marca2 = new Brands(name: "Nike").save(flush:true)
        marca1.addToArticles(new Article(name: "Zapatilla Sambarose", picture: "zapa23.png", total_items_in_this_category: "123")).save()
        marca1.addToArticles(new Article(name: "Zapatilla Coast Gold", picture: "zapa92.png", total_items_in_this_category: "234")).save()
        marca1.addToArticles(new Article(name: "Zapatilla Ozweego", picture: "zapa2.png", total_items_in_this_category: "534")).save()
        marca1.addToArticles(new Article(name: "Zapatilla Sleek", picture: "zapa.png", total_items_in_this_category: "972")).save()
        marca2.addToArticles(new Article(name: "Zapatilla Viotech", picture: "zapa21.png", total_items_in_this_category: "483")).save()
        marca2.addToArticles(new Article(name: "Zapatilla 4 Bred", picture: "zapa32.png", total_items_in_this_category: "43")).save()
        marca2.addToArticles(new Article(name: "Zapatilla Gnarhunters", picture: "zapa99.png", total_items_in_this_category: "83")).save()


        marshaler()
    }
    def destroy = {
    }

    private void marshaler(){
        JSON.registerObjectMarshaller(Brands){
            brands -> [
                    id: brands.id,
                    name: brands.name
            ]
        }
        JSON.registerObjectMarshaller(Article){
            article -> [
                    id: article.id,
                    name: article.name,
                    picture: article.picture,
                    total_items_in_this_category: article.total_items_in_this_category,
                    path_from_root: [],
                    children_categories: []
            ]
        }

    }
}
