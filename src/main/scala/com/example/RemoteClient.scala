package com.example

import akka.actor.Actor
import akka.actor.Actor.Receive

/**
 * Created by bo on 31/12/14.
 */
trait RemoteClient extends HttpCli{

}
class RemoteClientActor extends Actor with RemoteClient
{
  override def receive: Receive = ???
}
