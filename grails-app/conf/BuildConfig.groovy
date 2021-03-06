grails.project.work.dir = 'target'

grails.project.dependency.resolver = "maven" 
grails.project.dependency.resolution = {

    inherits 'global'
    log 'warn'

    repositories {
        inherits true // Whether to inherit repository definitions from plugins

        grailsPlugins()
        grailsHome()
        mavenLocal()
        grailsCentral()
        mavenCentral()
    }

    plugins {
        build ':release:3.0.1', ':rest-client-builder:2.0.0', {
            export = false
        }

        compile(":resources:1.2.1")
    }
}
