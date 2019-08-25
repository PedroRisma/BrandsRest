package brandsrest

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/brands" (resources:"brands") {
            "/article" (resources: "article")
        }

        "/article" (resources: "article")

        "/brands" (resources:"brands")

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
