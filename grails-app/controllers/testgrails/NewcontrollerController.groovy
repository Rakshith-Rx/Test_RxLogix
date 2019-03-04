package testgrails

class NewcontrollerController {

    def index() {
        redirect(action: 'hello')
    }

    def hello(){
        def message = "hello from Newcontroller"
        render view:'hello', model:[message: message]
    }
}
