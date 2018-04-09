package dirc

import com.sun.corba.se.spi.orbutil.threadpool.Work

class Manager {

    @Delegate
    Expert expert = new Expert()
    @Delegate
    Worker worker = new Worker()
}
