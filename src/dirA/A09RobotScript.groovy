package dirA

def robot = new A09Robot(type: 'arm', width: 10, height: 40)
println "$robot.type, $robot.width, $robot.height"

robot.access(x: 30, y: 20, z: 10, 50, true)
robot.access(50, true, x: 30, y: 20, z: 10)