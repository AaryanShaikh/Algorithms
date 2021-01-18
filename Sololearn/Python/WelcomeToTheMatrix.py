tp, fp, fn, tn = [int(x) for x in input().split()]
all= (tp+fp+fn+tn)

pos= tp+fp
tru= tp+fn

try: 
    acc = ((tp+tn)/all)
    prec= (tp/(tp+fp))
    rec= (tp/(tp+fn))
    f1s= round((2*prec*rec/(prec+rec)), 4)

except: 
    if all==0:
        acc = 0
        prec= 0
        rec= 0
        f1s= 0
        
    if pos==0: 
        acc = ((tp+tn)/all)
        prec= 0
        rec= (tp/(tp+fn))
        f1s= round((2*prec*rec/(prec+rec)), 4)

    if     tru == 0:
        acc = ((tp+tn)/all)
        prec= (tp/(tp+fp))
        rec= 0
        f1s= round((2*prec*rec/(prec+rec)), 4)
    

print(round(acc, 4))
print(round(prec, 4))
print(round(rec, 4))
print(f1s)