How to implement productivity measure: 

We have "assignToUser"
task table has user_id which means, which user the task is assigned to
we also have "status" 
need to record when the logged-in user assigns status "Done" to a task (it will be one of theirs)
adding "completed" user_completed_tasks with int codes: 0 for incomplete, 1 for completed late, 2 for completed on time
